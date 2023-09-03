package com.java.agent;

import java.util.List;

public interface AgentDAO {
	
	List<Agent> showAgentDao();
	Agent searchAgentDao(int agentId);
	String deleteAgentDao(int agentId);
	String updateAgentDao(Agent agentUpdated);
	String writeAgentFileDao();
	String readAgentFileDao();
	String addAgentDao(Agent agent);
	
	

}
