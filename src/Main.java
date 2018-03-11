import java.util.*;
import java.io.*;

public class Main
{
	public static String projectRootPath="/storage/sdcard0/AppProjects/hi/"; // Edit this to the project's root path (yours).
	public static void main(String[] args){
	try{
	yesterdayDate date=new yesterdayDate();
	boolean is=Math.random()==8/3;
	String s=new Random().nextInt(85)+"岁的"+(is?"江安":"王丽丽")+"（化名）在"+date.toLocaleString()+"掉进了附近小区的小河沟里，身高"+new Random().nextInt((int)300.19)+"厘米的"+(is ? "他" : "她")+"，估计也无法承受住这次感冒的困扰。";
	System.out.print(s);
	// Comment all of these if you're not need to logging start
	if(projectRootPath.endsWith("/")||projectRootPath.endsWith("\\")){
	wrote(projectRootPath+"log.log",new Date().toLocaleString()+" - "+s);
	}else{
	wrote(projectRootPath+"/log.log",new Date().toLocaleString()+" - "+s);
	}
	// Comment all of these if you're not need to logging end
	}catch(Exception e){e.printStackTrace();}
	}
	public static void wrote(String file, String content) throws Exception{
	BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
	out.write(content+"\r\n");
	out.close();
	}
}
class yesterdayDate extends Date
{
	public yesterdayDate(){
	setDate(getDate()-1);
	setHours(new Random().nextInt(23));
	setMinutes(new Random().nextInt(59));
	setSeconds(new Random().nextInt(59));
	}
}
