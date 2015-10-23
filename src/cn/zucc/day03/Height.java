package cn.zucc.day03;

public class Height {
	Stu1[] stus = new Stu1[50];
	int i=0;
public void add(Stu1 stu)
{
	stus[i]=stu;
	i++;
}	
public double avg()
	{
		double all=0;	
		for(int j=0; j<i;j++)
		{ all=all+stus[j].heig;}			
		return (all/i);	
	}

}
