import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function Grade(props){   
  let maths = parseInt(props.a);   
  let cs = parseInt(props.b);   
  let english = parseInt(props.c); 
  return <h2> Grading,Marks obtained in Maths is {maths} <br></br> Marks obtained in cs is {cs} <br></br> Marks obtained in english is {english}</h2>
}

ReactDOM.render(
  <Grade a="90" b="90" c="90"/>,
  document.getElementById('root')
);
