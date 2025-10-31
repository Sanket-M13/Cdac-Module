export function HeaderSection(props) {
    console.log(props)
    return(
        <div>
            <h1>{props.heading}</h1>
            <p>{props.intro}</p>
            <button>{props.buttonText}</button>
        </div>
    )
}