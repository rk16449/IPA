package application;

/*
 * Class which represents each question
 */
public class Question {
	
	private int id;
	private String category;
	private String[] questions ={ //I don't know if I should put the questions here - Uno
            "Describe the relationship between Content-Delivery Networks and the DNS service.",
            "Describe the principles behind the two phases of TCP congestion control, slow start and congestion avoidance. ",
            "Describe the 2 mechanisms TCP relies on to provide reliability.",
            "Explain the respective purposes of interdomain and intradomain routing. Explain and illustrate with a figure how interdomain and intradomain routing protocols rely on each other to solve the problem of global end-to-end path computation. ",
            "What happens to the IP and MAC address fields in the request packet as it travels along the network? (A ->S -> R1-> R2 -> B) ",
            "Define the concept of Sockets (in terms of IPA). Explain relationship between sockets and REST services",
            "Explain the role of DNS in server selection.",
            "Describe the “Go-back-N” pipelining protocol. Provide in your explanation the roles of acknowledgements and retransmission timers.",
            "Define encryption and hashing techniques.",
            "Explain the role of authoritative DNS servers in the process of DNS resolution."

          
        };
	private String[] answers;
	private String[] correctAnswer; 
	
	public Question(){
	
	}
        public String getQuestion(int n){
            String question = questions[n];
            return question;
        }
        
        
}
