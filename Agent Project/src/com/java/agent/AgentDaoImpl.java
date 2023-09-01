package com.java.agent;


	import java.util.ArrayList;
import java.util.List;

import com.java.agent.Agent;

public class AgentDaoImpl implements AgentDAO{
	
	static List<Agent> agentList;
	static{
		agentList = new ArrayList<Agent>();
	}

	@Override
	public List<Agent> showAgentDao() {
		return agentList;
	}

	 public int incrementAgent() {
		if(agentList.size()==0){
			return 1;
		}
		else{
			return agentList.get(agentList.size()-1).getAgentId()+1;
		}
	}

	@Override
	public String addAgentDao(Agent agent) {
		System.out.println(agent);
		int id = incrementAgent();
		agent.setAgentId(id);
		agentList.add(agent);
		System.out.println(agent);
		return "Agent is Added";
		
	}

	@Override
	public Agent searchAgentDao(int agentId) {
		
			Agent agentFound = null;
			for(Agent agent : agentList){
				if(agent.getAgentId() == agentId){
					agentFound = agent;
					break;
				}
			}
			return agentFound;
		
		
	}

	
	
	

}