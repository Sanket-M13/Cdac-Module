import express from 'express'
import mysql from 'mysql2/promise'; 

import { connectDB } from './src/configs/DbConfig.js';

import { registerStudent} from './src/controllers/StudentController.js';

import { AddFaculty, getfaculty } from './src/controllers/facultyController.js';

import { registerAdmin, adminLogin} from './src/controllers/adminController.js';

const app = express();
app.use(express.json());


app.get('/',(request,response)=>{
    response.send({message:"welcome to student api"});
});

app.post("/students",registerStudent);

app.get("/faculty",getfaculty);

app.post("/admins",registerAdmin);
app.post("/admins/login",adminLogin);

app.post("/Addfaculty", AddFaculty);

// app.put("/students/:student_id",updateStudent);

app.listen(9800,()=>{
    connectDB();
});