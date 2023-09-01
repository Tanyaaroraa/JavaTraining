package com.java.agent;

import java.util.List;

public class AgentBAL {
	static StringBuilder sb;
	static AgentDAO dao;
	static {
		dao = new AgentDaoImpl();
		sb = new StringBuilder();
	}

	public List<Agent> showAgentBal() {
		return dao.showAgentDao();
	}
	public String addAgentBal(Agent agent) throws AgentException {
		System.out.println(agent);
		if (validateAgent(agent)==true) {
			return dao.addAgentDao(agent);
		}
		throw new AgentException(sb.toString());
	}
	
	public boolean validateAgent(Agent agent) {
		boolean flag = true;
		if (agent.getFirstName().length() < 4 || agent.getLastName().length() < 4) {
			flag = false;
			sb.append("Name Contains min 4 characters...\r\n");
		}
		
		if(agent.getCity().equals("Delhi")){
			flag = false;
			sb.append("CITY CANNOT BE DELHI \n\r");
			
		}
		
		if(agent.getPremium()>99000||agent.getPremium()<5000){
			flag = false;
			sb.append("Basic Must be Between 5000 and 99000........\r\n");
		}
		
		return flag;

}
	
}