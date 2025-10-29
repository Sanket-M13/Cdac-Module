import { createConnection } from "mysql2/promise";

let connection = null;
export async function connectDB() {
    try {
        connection = await createConnection({
            host:'localhost',
            user: 'root',
            password:'cdac',
            port:3306,
            database:'dac'
        })
    } catch (error) {
        console.log("Failed to connect");
    }
    return connection;
}

export function getConneectionObj(){
    return connection;
}