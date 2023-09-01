package com.java.agent;

import java.util.List;

import com.java.agent.Agent;

public interface AgentDAO {
	List<Agent> showAgentDao();
	int incrementAgent();
	String addAgentDao(Agent agent);
	Agent searchAgentDao(int agentId);
	
	

}