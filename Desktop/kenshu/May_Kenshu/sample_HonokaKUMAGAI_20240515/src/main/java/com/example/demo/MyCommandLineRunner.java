package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	GangsRepository gangsRepository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("コマンドラインランナー実行開始");
		
		// CSVファイルからデータを読み込んでユーザーオブジェクトのリストを作成
        List<Person3> gangsList2 = readUsersFromCSV("src/main/resources/static/gangs.csv");
        
		for(Person3 p : gangsList2) {
			System.out.println("お名前　："+p.getFastname());
//			System.out.println("ご年齢　："+p.getAge() + "歳");
//			System.out.println("ご住所　："+p.getAddress());
//			System.out.println("基本データ："+p.toString());
//			System.out.println();
		}
		
		
		
		System.out.println("コマンドラインランナー実行終了");
	}
	
	/*
	 * 森田さんのコードお借りしつつ
	 */
	private List<Person3> readUsersFromCSV(String filePath) {
        List<Person3> gangs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String fastname = data[0];
                String lastname = data[1];
                
                int age;
                if (data[2].isEmpty()) {
                    System.err.println("年齢が空欄です。処理をスキップします。");
                    continue; // 年齢が空欄の場合は処理をスキップ
                } else {
                    age = Integer.parseInt(data[2]);
                }
                
                String address = data[3];
                gangs.add(new Person3(fastname, lastname, age, address));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gangs;
    }

}
