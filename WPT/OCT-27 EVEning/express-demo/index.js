import express, { Router } from 'express';

const app = express(); //create an express application and this will act as a Server

app.get('/', (request,response)=>{
    response.send("Hello welcome to home");
});

app.get("/sum/:a/:b", (request,response)=>{
    // {a:3,b:5}
    // const num1  = parseInt(request.params.a);
    // const num2  = parseInt(request.params.b);
    const data  = request.params;
    var a = parseInt(data.a);
    var b = parseInt(data.b);
    var z = a + b;
    response.send("The sum is "+z);
});
app.get('/factorial/:num',(request,response)=>{
    const num = parseInt(request.params.num);
   if(num < 0){
    response.status(400).send({message:"Invalid data"});
   }else{
         var f = 1;
    for(var i = 1; i<= num; i++ ){
        f = f*i;
    }
    response.send({factorial: f});
   }
});
app.get('/login',(request,response)=>{
    response.send("Welcome to login page");
});

app.listen(5400);
