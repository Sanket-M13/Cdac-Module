import { getConneectionObj } from "../configs/DbConfig.js";

export async function getfaculty(request,response){
    try {
        const conn = getConneectionObj();
        const [data] = await conn.query("Select * from Faculty");
        console.log(data);
        response.status(200).send(data);
        
    } catch (error) {
        console.log({message:"Something went wrong"});
        
    }
}

export async function AddFaculty(request,response) {
    try {
        const conn = getConneectionObj();
        const data = request.body;
        const [result] = await conn.query(`INSERT INTO FACULTY VALUE(${data.faculty_id},'${data.name}','${data.department}',${data.salary})`);
        console.log(result);
        
        if (result.affectedRows === 1) {
            return response.status(200).send({ message: "Faculty registered" });
        } else {
            return response.status(500).send({ message: "Faculty already registration Failed" });
    }
        
     } catch (error) {

         if (error.errno === 1062) {
        return response.status(400).send({ message: "Faculty already registered" });
    }

        console.log({message:"Something went wrong"});
    }
    
}