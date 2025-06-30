class A005 {
    public int solution(String skill, String[] skill_trees){

        char[] skillOrder = new char[skill.length()];
        for(int i = 0; i < skill.length(); i++){
            skillOrder[i] = skill.charAt(i);
        }

        int count = 0;

        for(int i = 0; i < skill_trees.length; i++){ // skill_trees의 인덱스를 순서대로 점검
            String skill_tree = skill_trees[i];
            int order = 0;
            boolean available = true;

            for(int j = 0; j < skill_tree.length(); j++){ // 해당 인덱스의 문자열을 하나씩 점검
                if(skill.contains(skill_tree.substring(j, j+1))) { // 해당 인덱스의 스킬이 선행스킬 순서 조건에 포함된 스킬이면
                    if(skill.indexOf(skill_tree.substring(j, j+1)) == order){ // 그 스킬이 순서에 맞게 되어있으면
                        order++;
                    } else { // 순서가 맞지 않으면 해당 문자열의 점검은 종료
                        available = false;
                        break;
                    }
                }
            }

            if(available){ // 점검했을 때 가능한 스킬 트리이면 count증가
                count++;
            }
        }

        return count;
    }
}
