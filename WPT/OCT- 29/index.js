import express from 'express'
import mysql from 'mysql2/promise'; 

import { connectDB } from './src/configs/DbConfig.js';

import { registerStudent } from './src/controllers/StudentController.js';

import { AddFaculty, getfaculty } from './src/controllers/facultyController.js';

const app = express();
app.use(express.json());


app.get('/',(request,response)=>{
    response.send({message:"welcome to student api"});
});

app.post("/students",registerStudent);

app.get("/faculty",getfaculty);

app.post("/Addfaculty", AddFaculty);

app.listen(7800,()=>{
    connectDB();
});