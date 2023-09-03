package com.java.agent;

import java.io.IOException;
import java.util.List;

public class AgentBAL {
	static StringBuilder sb;
	static AgentDAO dao;
	
	static{
		sb =new StringBuilder();
		dao = new AgentDaoImpl();
	}
	public String readEmployFileDao() throws ClassNotFoundException, IOException{
		return dao.readAgentFileDao();
	}
	
	public String writeEmployFileBal() throws IOException{
	return dao.writeAgentFileDao();
	}
	
	public String addAgentBal(Agent agent) throws AgentException{
		if(validateAgent(agent)==true){
			return dao.addAgentDao(agent);
		}
		throw new AgentException(sb.toString());
	
			
			}
	public List<Agent>showAgentBal(){
		return dao.showAgentDao();
	}
	
	
	
	public boolean validateAgent(Agent agent){
		boolean flag= true;
	if(agent.getAgentId()<=0){
		flag = false;
	
	sb.append("Employ No Cannot be zero or negative ...\r\n");
	
}
	
	if(agent.getCity()=="Delhi"){
		flag = false;
		sb.append("Name cannot be city\r\n");
	}
	
	if(agent.getFirstName().length()<4){
		 flag=false;
		sb.append("Username first must have 4 letters minimum ...\r\n");
	}
	if(agent.getLastName().length()<4){
		 flag=false;
		sb.append("Userlast name must have  min 4 characters...\r\n");
	}
	if(agent.getPremium()<5000 || agent.getPremium()>9900){
		flag = false;
		sb.append("Premium must be between 5000 and 99000...\r\n");
	}
		return flag;		
	
	}
	public String deleteAgentBal(int agentId) {
		return dao.deleteAgentDao(agentId);
	}

	public String updateAgentBal(Agent agentUpdated) throws AgentException {
		if(validateAgent(agentUpdated)==true){
			return dao.updateAgentDao(agentUpdated);
		}
		throw new AgentException(sb.toString());
	}

	public Agent searchAgent(Agent agent) {
		return dao.searchAgentDao(agentId);
	}
	
		
	}
	
