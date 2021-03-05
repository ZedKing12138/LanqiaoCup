package test;

public class Case_currentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long timeMillSec=System.currentTimeMillis();
		long timeSec=timeMillSec/1000;
		long timeSecInDay=timeSec%86400;
		long hour=timeSecInDay/3600;
		long timeSecInHour=timeSecInDay-hour*3600;
		long minute=timeSecInHour/60;
		long second=timeSecInHour-minute*60;
		System.out.println("现在是："+(hour+8)+" 时 "+minute+" 分  "+second+" 秒 ");
		//说明一下，这里的得到是格林威治标准时间，而我国是在东八时区，需要加上8.
	}

}
