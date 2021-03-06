package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import CustomPackages.Package;

public class LogReader {
	 BufferedReader reader = null;

	    public LogReader(String fileDir)
	    {
	        try {
	            reader = new BufferedReader(new FileReader(fileDir));
	        } catch (Exception ex) {

	        }
	    }
	    public ArrayList<Package> PackagesWrapper(int bulkSize)
	    {
	        LogPackage lp = new LogPackage();

	        for (int i = 0; i < bulkSize; ++i)
	        {
	            try {
	                String line = reader.readLine();
	                if (line == null) {
	                    break;
	                }
	                lp.insertValue(line);
	            } catch (Exception ex) {
	            }
	        }
	        return lp.LogPackages;
	    }
	
	
	
}
