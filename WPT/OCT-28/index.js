import express from 'express';

const app = express();
app.use(express.json())

app.get('/', (req, res) => {
  res.send("Hiii!!!");
});

app.post('/sum',(req, res) => {
  console.log(req.body); 
  res.send({ message: "Hello" });
});

app.listen(6600, () => {
  console.log("Server running on port 6600");
});
