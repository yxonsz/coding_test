class Solution {
	public int solution(String my_string) {
		int answer = 0;

		String[] arr = my_string.split("[a-zA-Z]+");
		for (String string : arr) {
			try {
				answer += Integer.parseInt(string);
			} 
            catch (Exception e) {
				continue;
			}
		}
		return answer;
	}
}