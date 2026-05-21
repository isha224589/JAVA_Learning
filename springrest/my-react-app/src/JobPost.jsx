import { useEffect, useState } from "react";
import { axios } from "react";

function JobPost(){
    const [post, setPost] = useState(null);
    useEffect(()=>{
        const fetchInitialPosts = async ()=>{
            const response = await axios.get('http://localhost:8000/jobPosts');
            setPost(response.data);
        };
        fetchInitialPosts();
    },[]);
    return(
        <>
    
    </>
    )
    
}

export default JobPost;