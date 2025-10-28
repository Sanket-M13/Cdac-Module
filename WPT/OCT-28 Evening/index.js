import express from 'express';

import {createConnection} from 'mysql2/promise'

const app = express();

let conn;
async function connectDb(){
    try {
        conn = await createConnection({
        host: 'localhost',
        user: 'root',
        password: 'cdac',
        port: 3306,
        database: 'dac'
});
    console.log('Sucessfull');
    // console.log(conn);
    } catch (error) {
        console.log('Error in DB connection');
        
        console.log(error);
        
    }
}

app.get('/employee',async (request,response)=>{
    try {
        const [rows] =  await conn.query("SELECT * FROM EMPLOYEE");
        console.log(rows);
        response.status(200).send(rows);
    } catch (error) {
        response.status(500).send({message:"Something went Wrong"});
    }
});

app.get("/employee/:id",async (request,response) => {

    try {
        const [rows] =  await conn.query("SELECT * FROM EMPLOYEE Where EmpId="+request.params.id);
        console.log(rows);
        if(rows.length === 0){
            // response.status(404).send({message:"Employee Not found from id "+request.params.id});
        }
        response.status(200).send(rows[0]);
        
    } catch (error) {
          response.status(500).send({message:"Something went Wrong"});
    }
    
});

app.delete("/employee/:id",async (request,response)=>{
      try {
        const [deleteResult] = await conn.query(
      "DELETE FROM EMPLOYEE WHERE EmpId = ?",
      [request.params.id] );
      console.log(deleteResult.affectedRows);
      if(deleteResult.affectedRows === 0){
        response.status(404).send({message:"Employee Not found"});
      }else{
        response.status(200).send({message:"Deleted"});
      }
      
        // response.status(200).send("Deleted");
        
    } catch (error) {
          response.status(500).send({message:"Something went Wrong"});
    }
});

app.get("/",(request,response)=>{
    response.send({message:"Welcome to employee crud"});
});

//Crud; Create Read Update Delete




app.listen(4900,()=>{
    connectDb();
});