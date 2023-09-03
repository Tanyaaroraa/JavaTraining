package com.java.agent;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class AgentMain  {
		static AgentBAL bal;
		static Scanner sc;
		static{
			bal = new AgentBAL();
			sc = new Scanner(System.in);
		}
		
		public static void main(String[] args) throws AgentException{
			int choice;
			do{
				System.out.println("O P T I O N S");
				System.out.println("-----------------");
				System.out.println("1. Add Agent");
				System.out.println("2. Show Agent ");
				System.out.println("3. Search Employ");
				System.out.println("4. Delete Employ");
				System.out.println("5 Update Employ");
				System.out.println("6.  Exit");
				System.out.println("7.  Write Employ List ");
				System.out.println("8. Read Employ File");
				System.out.println("Enter the choice   ");
				choice  = sc.nextInt();
				
				switch (choice) {
				case 1:
					try{
						addAgentMain();
					} catch(AgentException e){
						System.err.println(e.getMessage());
					}
					
					break;
				case 2:
						showAgentMain(); 
					break;
				
				case 3:
						searchAgentMain();
						break;
						
					case 4:
						deleteAgentMain();
						break;
						
					case 5:
						try{
							updateAgentMain();
						}catch(AgentException e) {
							e.printStackTrace();
						}
					     break;
					    
					case 6:
						return;
					
					case 7:
						try {
							writeAgentFileMain();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					case 8:
						try {
							readAgentFileMain();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
				break;
				}
			
			}
				while(choice!=6);
			}
		
		
				
				
				public static void readAgentFileMain() throws ClassNotFoundException, IOException {
			// TODO Auto-generated method stub
					System.out.println(bal.readEmployFileDao());
			
		}


				public static void writeAgentFileMain() throws IOException {
			// TODO Auto-generated method stub
					System.out.println(bal.writeEmployFileBal());
			
		}


				public static void deleteAgentMain() {
			// TODO Auto-generated method stub
					int agentId;
					System.out.println("Enter Employ Number   ");
					agentId = sc.nextInt();
					System.out.println(bal.deleteAgentBal(agentId));
			
		}
				
				public static void searchAgentMain() {
					{
						int empno;
						System.out.println("Enter Employ Number    ");
						empno = sc.nextInt();
						Agent agent = (bal.searchAgent(agent));
						if(agent!=null){
							System.out.println(agent);
						}
						else {
							System.out.println("Record Not Found     ");
						}
					}




				public static void updateAgentMain() throws AgentException{
					Agent agentUpdated = new Agent();
					System.out.println("Enter Employ Number   ");
					agentUpdated.setAgentId(sc.nextInt());
					System.out.println("Enter First Name    ");
					agentUpdated.setFirstName(sc.next());
					System.out.println("Enter First Name    ");
					agentUpdated.setLastName(sc.next());
					System.out.println("Enter City    ");
					agentUpdated.setCity(sc.next());
					System.out.println("Enter PayMode   ");
				    agentUpdated.setPayMode(PayMode.valueOf(sc.next()));
					agentUpdated.setPremium(sc.nextDouble());
					System.out.println(bal.updateAgentBal(agentUpdated));
			
		}

				
			
		}




				public static void addAgentMain() throws AgentException{
					Agent agent = new Agent();
					
					
					System.out.println("Enter firstName  ");
					agent.setFirstName(sc.next());
					System.out.println("Enter lastName  ");
					agent.setLastName(sc.next());
					
					System.out.println("Enter the city  ");
					agent.setCity(sc.next());
					System.out.println("Choose Paymode ");
					agent.setPayMode(PayMode.valueOf(sc.next()));
					System.out.println("Enter Premium  ");
					agent.setPremium(sc.nextDouble());
					
					
					
					
					System.out.println(bal.addAgentBal(agent));
					
				}
				public static void showAgentMain(){
					List<Agent> agentList = bal.showAgentBal();
					for(Agent agent : agentList){
						System.out.println(agent);
					}
					
					
				}
				
	
public static void addEmployMain() throws AgentException{
	Agent agentUpdated = new Agent();
	System.out.println("Enter Employ Number   ");
	agentUpdated.setAgentId(sc.nextInt());
	System.out.println("Enter First Name    ");
	agentUpdated.setFirstName(sc.next());
	System.out.println("Enter First Name    ");
	agentUpdated.setLastName(sc.next());
	System.out.println("Enter City    ");
	agentUpdated.setCity(sc.next());
	System.out.println("Enter PayMode   ");
    agentUpdated.setPayMode(PayMode.valueOf(sc.next()));
	agentUpdated.setPremium(sc.nextDouble());
	System.out.println(bal.updateAgentBal(agentUpdated));
}
}


