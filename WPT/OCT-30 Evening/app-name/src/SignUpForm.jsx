export function SignUpForm() {
  return (
    <form>
      <input type="text" placeholder="Enter Name" />
      <br/><br/>
      <input type="password" placeholder="Enter Password" />
      <br/><br/>
      <input type="email" placeholder="Enter Email" />
      <br/><br/>
      <input type="tel" placeholder="Enter Phone" />
      <br/><br/>
      <input type="submit" value="Sign Up" />
    </form>
  );
}
