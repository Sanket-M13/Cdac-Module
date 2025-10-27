// const fs = require('fs');

// fs.writeFileSync("myfile.txt","this is my text file");
// console.log("after");
// console.log("after");

// fs.readFile("myfile.txt",(error,data)=>{
//     if(error){
//         console.log(error);
//     }else{
//         console.log(data.toString());// data into the buffer or byte form we have to convert to string
//     }
// });
// console.log("after reading file");

// var data = fs.readFileSync("myfile.txt");
// console.log(data.toString());

// console.log("after reading file");

// const http = require('http');

// const server = http.createServer((request, response)=>{
//     response.write("hello World");
//     response.end();
// });

// server.listen(4500, ()=>{
//     console.log("Server is started at 4500");
// });

import {createServer} from 'http'

const server = createServer((request,response)=>{
    response.write('Hello World');
    response.end();
});

server.listen(4500);
