package com.class23;

public class Test {

	public static void main(String[] args) {
		System.out.println("---Creating Employee object---");
		Employee emp = new Employee();
		System.out.println(Employee.department);
		Employee.work();
		emp.salary = 90000;
		emp.getPaid();

		System.out.println("---Creating Scrum Team Object---");
		ScrumTeam st = new ScrumTeam();
		st.salary = 100000;
		st.getPaid();
		st.artifacts = "Product Backlog, Sprint Backlog, Burndown chart";
		st.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp, Sprint Reivew, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();

		System.out.println("---Creating Developer object");
		Developer dev = new Developer();
		Developer.work();
		dev.salary = 120000;
		dev.getPaid();
		dev.artifacts = "Sprint Backlog";
		dev.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp, Sprint Reivew, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();

		System.out.println("---Creating Tester object");
		Tester qa = new Tester();
		qa.salary = 100000;
		qa.getPaid();
		qa.artifacts = "Sprint Backlog";
		qa.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp, Sprint Reivew, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();

		System.out.println("---Creating Business Analyst object");
		BusinessAnalyst ba = new BusinessAnalyst();
		ba.salary = 85000;
		ba.getPaid();
		ba.artifacts = "Sprint Backlog, Product Backlog";
		ba.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp, Sprint Reivew, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();

		System.out.println("---Creating Scrum Master object");
		ScrumMaster sm = new ScrumMaster();
		sm.salary = 90000;
		sm.getPaid();
		sm.artifacts = "Burn Down Chart";
		sm.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp, Sprint Reivew, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();

		System.out.println("---Creating Product Owner object");
		ProductOwner po = new ProductOwner();
		po.salary = 150000;
		po.getPaid();
		po.artifacts = "Sprint Backlog, Product Backlog";
		po.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp, Sprint Reivew";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeeBacklog();
		po.talkToTheClient();

		System.out.println("---Creating Frontend Developer object");
		Frontend fe = new Frontend();
		fe.salary = 130000;
		fe.getPaid();
		fe.artifacts = "Sprint backlog, Burn Down Chart";
		fe.ceremonies = "Sprint Planning, Daily StandUp, Sprint Reivew, Sprint Retro";
		fe.workOnArtifacts();
		fe.attendScrumMeetings();
		fe.doHTML();

		System.out.println("---Creating Backend Developer object");
		Backend be = new Backend();
		be.salary = 130000;
		be.getPaid();
		be.artifacts = "Sprint backlog, Burn Down Chart";
		be.ceremonies = "Sprint Planning, Daily StandUp, Sprint Reivew, Sprint Retro";
		be.workOnArtifacts();
		be.attendScrumMeetings();
		be.doSQL();

		System.out.println("---Creating Manuel Tester object");
		ManuelTester mt = new ManuelTester();
		mt.salary = 60000;
		mt.getPaid();
		mt.artifacts = "Sprint backlog, Burn Down Chart";
		mt.ceremonies = "Sprint Planning, Daily StandUp, Sprint Reivew, Sprint Retro";
		mt.workOnArtifacts();
		mt.attendScrumMeetings();
		mt.testManually();

		System.out.println("---Creating Automation Tester object");
		AutomationTester at = new AutomationTester();
		at.salary = 120000;
		at.getPaid();
		at.artifacts = "Sprint backlog, Burn Down Chart";
		at.ceremonies = "Sprint Planning, Daily StandUp, Sprint Reivew, Sprint Retro";
		at.workOnArtifacts();
		at.attendScrumMeetings();
		at.codeInJava();
	}
}
