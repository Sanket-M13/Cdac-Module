import { getConneectionObj } from "../configs/DbConfig.js";
import { compareSync, hashSync } from "bcrypt";
import jwt from "jsonwebtoken";

export async function registerAdmin(request,response) {
    try {
        const conn = getConneectionObj();
        const {id,name,phone,password,email} = request.body;
        const encrypetPassword = hashSync(password, 12);
        const qry = `INSERT INTO admin VALUES(${id},'${name}','${phone}','${encrypetPassword}','${email}')`;
        const [resultSet] = await conn.query(qry);
        if (resultSet.affectedRows === 1) {
            response.status(200).send({ message: 'Admin registered' });
        }
        else {
            response.status(500).send({ message: 'Admin registration failed' });
        }
    } catch (error) {
         console.log(error);
        if (error.errno === 1062) {
            response.status(400).send({ message: 'Admin with this id already exists' });
        }
        else {
            response.status(500).send({ message: 'Something went wrong' });
        }
    }
    
}

export async function adminLogin(request,response) {
    try {
        const conn = getConneectionObj();
        const {phone, password} = request.body;
        const qry = `SELECT * FROM admin WHERE phone='${phone}'`;
        const [rows] = await conn.query(qry);

        if(rows.length === 0){
            response.status(400).send({message:"Login Failed, phone doesn't exist"});
        }else{
            if(compareSync(password,rows[0].encryptedPassword)){
                const token = jwt.sign({adminId:rows[0].id},'hello1234');
                response.status(200).send({token,message:'Login successful'});
            }else{
                response.status(400).send({message:"Login failed, Password is invalid"})
            }
        }

    } catch (error) {
           console.log(error);
        response.status(500).send({ message: 'Something went wrong' });
    }
    
}
