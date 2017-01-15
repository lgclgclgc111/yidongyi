package com.sectong.communal;

import java.io.File;
import java.nio.file.Paths;

import org.hyperic.sigar.Sigar;

import com.jfinal.kit.PathKit;

/*
 * 注册Sigar来实现强大的硬件监控
 * 用的时候 声明 Sigar sigar = SigarUtils.sigar;
 * Sigar的库文件放在getWebRootPath()/files/sigar/下
 * 如果改变了的话注意在下面的路径改
 */
public class SigarUtils
{
	public final static Sigar sigar = initSigar();

	private static Sigar initSigar()
	{
		try
		{
			// 此处只为得到依赖库文件的目录，可根据实际项目自定义
			String file = Paths.get(PathKit.getWebRootPath(), "files", "sigar", ".sigar_shellrc").toString();
			File classPath = new File(file).getParentFile();

			String path = System.getProperty("java.library.path");
			String sigarLibPath = classPath.getCanonicalPath();
			// 为防止java.library.path重复加，此处判断了一下
			if (!path.contains(sigarLibPath))
			{
				if (isOSWin())
				{
					path += ";" + sigarLibPath;
				} else
				{
					path += ":" + sigarLibPath;
				}
				System.setProperty("java.library.path", path);
			}
			return new Sigar();
		} catch (Exception e)
		{
			return null;
		}
	}

	public static boolean isOSWin()
	{// OS 版本判断
		String OS = System.getProperty("os.name").toLowerCase();
		if (OS.indexOf("win") >= 0)
		{
			return true;
		} else
			return false;
	}
}
