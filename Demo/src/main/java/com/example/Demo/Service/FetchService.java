package com.example.Demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Entity.FetchNextNumber;
import com.example.Demo.Repo.FetchRepo;

@Service
public class FetchService {
	
private FetchRepo frepo;

@Autowired
public FetchService(FetchRepo fr)
{
	frepo=fr;
}

public void Save(FetchNextNumber fg)
{
	frepo.save(fg);
}

public FetchNextNumber GetConcode(int ccode) {
	
	Optional<FetchNextNumber> fn=frepo.findById(ccode);
	
	
	try {
	    Thread.sleep(5000);       				//THIS THREAD  introduce a delay of 5 seconds 
	} catch (InterruptedException ie) {
	    Thread.currentThread().interrupt();
	}
	FetchNextNumber fnextnum=fn.get();
	int nnum = 0;
	if(ccode==1) {
		
		fnextnum.setOldvalue(10);
		nnum=nnum+10;
		
	}
	else {
		nnum=10*(ccode)-(ccode-1);
	
		fnextnum.setOldvalue(nnum);
		
	}
	
	fnextnum.setCategoryCode(ccode);
	
	int n=nnum;
	if(digSum(n)==1)
    {
		System.out.println("in if");
    	n=n+9;
    	
    }
	System.out.println("new value is"+n);
	
	fnextnum.setNewvalue(n);
	
	frepo.save(fnextnum);
	return fnextnum;
	
	
}
public static int digSum(int n)
{
    int sum = 0;

    while (n > 0 || sum > 9)
    {
        if (n == 0) {
            n = sum;
            sum = 0;
        }
        sum += n % 10;
        n /= 10;
    }
    return sum;
}

}
