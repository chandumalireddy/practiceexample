package com.example.program2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.program2.service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class TestController1 {


	  
	  @Autowired
	  RestTemplate restTemplate;
	  
	
	  
	  
		
	public TestController() {
		System.out.println("object created for controller");
		
	}
	@RequestMapping({ "/hello1" })
	void b()
	{
	
	}



	
	@RequestMapping({ "/hello" })
	public List firstPage() {
		
		List<Integer>a=Arrays.asList(1,22,22,5,11,1,4,4,2,6);
		
		List b= a.stream().map(x->x*x).toList();
		List c= a.stream().sorted().collect(Collectors.toList());
		 Integer d = a.stream().filter(x->x==22).findFirst().get();
		 
		 List<Integer> dd = a.stream().filter(x->x>5).map(x->x).collect(Collectors.toList());
		 long e = a.stream().filter(x->x==22).count();
		 Set<Integer> f = a.stream().filter(x->Collections.frequency(a, x)>1).collect(Collectors.toSet());
		 
		 Map<Integer, Long> g =a.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 
		 
		 List<String>s=Arrays.asList("ab","bc","ef");
		 List h=s.stream().map(x-> new StringBuilder(x).reverse()).toList();
		 
	
		 List hh= s.stream().map(x->new StringBuilder(x).length()).toList();
		 
		 
		 
		 Map<Integer, String> map=new HashMap();  
		   
		    map.put(1,"a");  
		    map.put(5,"b");  
		    map.put(2,"c");  
		    map.put(6,"d");  
		    
		 List<Entry<Integer, String>>mm=   map.entrySet().stream().filter(x->x.getKey()>2).toList();
		 return h;
	}
		/*
		
		HashMap<String,String> map=new HashMap<>();
		map.put("", "a");
		map.put("", "b");
		map.put( "","a");
		
		Set<Integer> set=new HashSet<>();
		set.add(2);   
		set.add(2);   
		set.add(1);   
		set.add(1);   
		
		*}
		*/
		
	
	  /*
		@PostMapping({ "/hello" })
		public void firstPage(@RequestBody emp e)  {
			
			
			System.out.println(e.getAge());
			for(homeAddress h : e.home)
			{
				System.out.println(h.city +" "+h.street);
			}
		}
			
		/*	Thread1 t1 =new Thread1();
			t1.start();
			Thread2 t2 =new Thread2();
			t2.start();*/
			
/*
		 days d = new days(day.Mondya);
			d.daysdes();*/
			
		/*	
			Map<String,String> mapp = new HashMap<String,String>();
			
			mapp.put("name", "1");
			mapp.put("roll No", "2");
			
			
			for(Map.Entry<String,String> a:mapp.entrySet())
			{
				System.out.print(a.getKey()+" "+a.getValue());
			}*/
			
		/*	
			emp e = new emp();
			homeAddress h = new homeAddress();
			
			h.setCity("tenali");
			h.setStreet("abcd");
			
			e.setName("chandu");
			e.setAge(22);
			e.setSal(30000);
			e.setAdd(h);
			
			emp e1 = new emp();
			homeAddress h1 = new homeAddress();
			
			h1.setCity("guntur");
			h1.setStreet("aaa");
			
			e1.setName("sekhar");
			e1.setAge(22);
			e1.setSal(34000);
			e1.setAdd(h1);
			
		
			final ObjectMapper objectMapper = new ObjectMapper();
		List<emp> emmp = objectMapper.readValue(new File("C:\\Users\\CHANDU\\OneDrive\\Documents\\employee.json"), new TypeReference<List<emp>>(){});
		
		System.out.println(emmp.size());
		for(emp newemp:emmp)
		{
			if(newemp.name.equals(e.getName()))
			{
				if(newemp.getAge()==e.getAge() && newemp.getSal()==e.getSal() && newemp.getAdd().getCity().equals(e.getAdd().getCity()) && newemp.getAdd().getStreet().equals(e.getAdd().getStreet()))
				{
					System.out.println(newemp.getName()+" matching");
				}
				else
				{
					System.out.println(newemp.getName()+ " not matching" );
				}
			}
			if(newemp.name.equals(e1.getName()))
			{
				if(newemp.getAge()==e1.getAge() && newemp.getSal()==e1.getSal() && newemp.getAdd().getCity().equals(e1.getAdd().getCity()) && newemp.getAdd().getStreet().equals(e1.getAdd().getStreet()))
				{
					System.out.println(newemp.getName()+" matching");
				}
				else
				{
					System.out.println(newemp.getName()+ " not matching" );
				}
			}
		}
		}*/}
		
			











/*
class Table{
	void table1(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n);
		}
	}
	
}
	
class Thread1 extends Thread{
	
	
	public void run()
	{
		Table t1= new Table();
		t1.table1(1);
	}
}

class Thread2 extends Thread{
	
	
	public void run()
	{
		Table t2= new Table();
		t2.table1(2);
	}
}*/




