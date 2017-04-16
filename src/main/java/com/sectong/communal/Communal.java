package com.sectong.communal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.FileSystem;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

public abstract class Communal
{

	public static Integer getWeekday()
	{
		// TODO 自动生成的方法存根
		Calendar now = Calendar.getInstance();
		// 一周第一天是否为星期天
		boolean isFirstSunday = (now.getFirstDayOfWeek() == Calendar.SUNDAY);
		// 获取周几
		int weekDay = now.get(Calendar.DAY_OF_WEEK);
		// 若一周第一天为星期天，则-1
		if (isFirstSunday)
		{
			weekDay = weekDay - 1;
			if (weekDay == 0)
			{
				weekDay = 7;
			}
		}
		// 返回周几
		return weekDay;
	}

	public static Integer getCPUinf() throws SigarException
	{
		Sigar sigar = SigarUtils.sigar;
		CpuPerc perc = sigar.getCpuPerc();
		return (int) (perc.getCombined() * 100);
	}

	public static Integer getMeminf() throws SigarException
	{
		Sigar sigar = SigarUtils.sigar;
		Mem mem = sigar.getMem();
		float total = mem.getTotal();
		float used = mem.getUsed();
		return (int) (used / total * 100);
	}

	public static Integer getdiskinf() throws SigarException
	{
		Sigar sigar = SigarUtils.sigar;
		Double Total = (double) 0;
		Double Used = (double) 0;

		FileSystem fslist[] = sigar.getFileSystemList();
		for (int i = 0; i < fslist.length; i++)
		{
			FileSystem fs = fslist[i];
			FileSystemUsage usage = null;
			usage = sigar.getFileSystemUsage(fs.getDirName());
			switch (fs.getType())
			{
			case 0: // TYPE_UNKNOWN ：未知
				break;
			case 1: // TYPE_NONE
				break;
			case 2: // TYPE_LOCAL_DISK : 本地硬盘

				Total += usage.getTotal();
				Used += usage.getUsed();
				break;
			case 3:// TYPE_NETWORK ：网络
				break;
			case 4:// TYPE_RAM_DISK ：闪存
				break;
			case 5:// TYPE_CDROM ：光驱
				break;
			case 6:// TYPE_SWAP ：页面交换
				break;
			}
		}

		return (int) (Used / Total * 100);
	}

	public static String getTime()
	{
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return dateFormat.format(now);
	}
}
