package Utils;

import java.util.ArrayList;

import CustomPackages.FeedPackage;
import CustomPackages.MSITPackage;
import CustomPackages.Package;
public class LogPackage {
	 public LogPackage()
	    {
	        LogPackages = new ArrayList<Package>();
	    }

	    public ArrayList<Package> LogPackages;

	    public void insertValue(String line)
	    {
	        String[] strs = line.split("\t");
	        if(strs.length == 46)
	        {
	            Package fp = new MSITPackage();
	            fp.wrap(strs);
	            LogPackages.add(fp);
	        }else if(strs.length == 32){
	        	Package fp = new FeedPackage();
	            fp.wrap(strs);
	            LogPackages.add(fp);
	        }
	}
}
