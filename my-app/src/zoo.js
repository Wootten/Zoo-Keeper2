import React, { useState, useEffect } from 'react';
import './App.css';


function Zoo(){
    const [message, setMessage] = useState([])

    useEffect(()=>{
            fetch('http://localhost:8080/contents').then(res=>{
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
                <li>{e.Title}</li>
                <li>{e.Artist}</li>
                <li>{e.Feat}</li>
                <li>{e.Genre}</li>
                <li>{e.Duration}</li>
                </ul>
            </>
            )
            )}
        </main>
        );
}

export default Songs;