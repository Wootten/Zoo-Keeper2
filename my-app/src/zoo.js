import React, { useState, useEffect } from 'react';
import './App.css';


function Zoo(){
    const [message, setMessage] = useState([])

    useEffect(()=>{
            fetch('http://ec2-3-11-70-235.eu-west-2.compute.amazonaws.com:8080/zooCreation').then(res=>{
            return res.json()}).then(data=>{
            const newData = Object.values(data)
            setMessage(newData)

        })
            }, [])

return (
<main>
        {message.map(e=>(
            <>
                <ul>
                <li>{e.weight}</li>
                <li>{e.breed}</li>
                <li>{e.yearOfBirth}</li>
                <li>{e.speed}</li>
                </ul>
            </>
            )
            )}
        </main>
        );
}

export default Zoo;