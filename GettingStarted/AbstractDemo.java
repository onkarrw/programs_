
abstract class Writer
{
	public abstract void write();
}

class Pen extends Writer
{
	public void write()
	{
	
		System.out.println("In pen");
	}
	
	
}
 
class Pencil extends Writer
{
	public void write()
	{

		System.out.println("In pencil");
	}
	
}

class Kit
{
	public void doSomething(Pen p)
	{
		p.write();
	}
}

public class AbstractDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Kit k = new Kit();
		Pen p = new Pen();
		
		Pencil pc = new Pencil();
		
		k.doSomething(p);
	}
	

}


/*

<p><br></p>
<p>abstract class Writer{</p>
<p>&nbsp; &nbsp; public abstract void write();</p>
<p>}</p>
<p>class Pen extends Writer</p>
<p>{</p>
<p>&nbsp; &nbsp; public void write()</p>
<p>&nbsp; &nbsp; { &nbsp;</p>
<p>&nbsp; &nbsp; &nbsp; &nbsp; System.out.println(&quot;In pen&quot;);</p>
<p>&nbsp; &nbsp; }</p>
<p>}</p>
<p>class Pencil extends Writer</p>
<p>{</p>
<p>&nbsp; &nbsp; public void write()</p>
<p>&nbsp; &nbsp; {</p>
<p>&nbsp; &nbsp; &nbsp; &nbsp; System.out.println(&quot;In pencil&quot;);</p>
<p>&nbsp; &nbsp; }</p>
<p>}</p>
<p>class Kit</p>
<p>{</p>
<p>&nbsp; &nbsp;&nbsp;public void doSomething(Pen p)</p>
<p>&nbsp; &nbsp;&nbsp;{</p>
<p>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp;p.write();</p>
<p>&nbsp; &nbsp; }</p>
<p>}</p>
<p>public class AbstractDemo {</p>
<p>&nbsp; &nbsp; @SuppressWarnings(&quot;unused&quot;)</p>
<p>&nbsp; &nbsp; public static void main(String[] args) {</p>
<p>&nbsp; &nbsp; &nbsp; &nbsp; Kit k = new Kit();</p>
<p>&nbsp; &nbsp; &nbsp; &nbsp; Pen p = new Pen();</p>
<p>&nbsp; &nbsp; &nbsp; &nbsp; Pencil pc = new Pencil();</p>
<p>&nbsp; &nbsp; &nbsp; &nbsp; k.doSomething(p);</p>
<p>&nbsp; &nbsp; }</p>
<p>}</p>
<p><br></p>



*/
