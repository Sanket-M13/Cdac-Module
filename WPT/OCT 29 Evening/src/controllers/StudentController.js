import { getConneectionObj } from "../configs/DbConfig.js";

export async function registerStudent(request, response){
  try {
    const conn  = getConneectionObj();
    const data = request.body;

    const qry = `
      INSERT INTO STUDENT (student_id, name, department, faculty_id, marks)
      VALUES (${data.student_id}, '${data.name}', '${data.department}', '${data.faculty_id}', ${data.marks})
    `;

    const [result] = await conn.query(qry);

    if (result.affectedRows === 1) {
      return response.status(200).send({ message: "Student registered" });
    } else {
      return response.status(500).send({ message: "Student registration failed" });
    }

  } catch (error) {
    console.error(error);

    if (error.errno === 1062) {
      return response.status(400).send({ message: "Student already registered" });
    }

    return response.status(500).send({ message: "Something went wrong" });
  }
}

export async function updateStudent(request,response) {
  try {
    const conn  = getConneectionObj();
    const {name,department,faculty_id,marks} = request.body;

    const qry = `UPDATE STUDENT SET name ='${name}', 'department=${department}', faculty_id=${faculty_id},marks=${marks} WHERE student_id=${request.params.student_id} `;

     const [result] = await conn.query(qry);  

      if (result.affectedRows === 1) {
      return response.status(200).send({ message: "Student Updated" });
    } else {
      return response.status(500).send({ message: "Student Updation failed" });
    }

  } catch (error) {
    return response.status(500).send({ message: "Something went wrong" });
    
  }
  
}