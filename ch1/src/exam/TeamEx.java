package exam;

import java.util.List;

public class TeamEx {
    public static void main(String[] args) {
        Team team = new Team();
        team.setId(1L);
        team.setName("team1");

        TeamMember member = new TeamMember();
        member.setId(1L);
        member.setName("정이안");
        member.setTeam(team);

        TeamMember member2 = new TeamMember();
        member2.setId(2L);
        member2.setName("최지우");
        member2.setTeam(team);

        // 정이안 팀정보 조회
        System.out.println(member.getTeam());
        System.out.println(member.getTeam().getName());
        // 최지우 팀정보 조회
        System.out.println(member2.getTeam());

        // 팀 => 팀원 조회
        team.setTeamMembers(List.of(member, member2));
        for (TeamMember teamMember : team.getTeamMembers()) {
            System.out.printf("%s : %s \n", teamMember.getName(), teamMember.getTeam().getName());
        }
    }
}
