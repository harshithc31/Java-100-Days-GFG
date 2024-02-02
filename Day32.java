//Maximum Meetings in One Room
//There is one meeting room in a firm. There are N meetings in the form of (S[i], F[i]) where S[i] is the start time of meeting i and F[i] is the finish time of meeting i. The task is to find the maximum number of meetings that can be accommodated in the meeting room. You can accommodate a meeting if the start time of the meeting is strictly greater than the finish time of the previous meeting. Print all meeting numbers.
//Note: If two meetings can be chosen for the same slot then choose meeting that finishes earlier.

class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int[][] meeting = new int[N][3];
        for(int i=0; i<N; i++){
            meeting[i][0] = i;
            meeting[i][1] = S[i];
            meeting[i][2] = F[i];
        }
        Arrays.sort(meeting, Comparator.comparingDouble(o -> o[2]));
        list.add(meeting[0][0]+1);
        int lastEndTime = meeting[0][2];
        for(int i=1; i<N; i++){
            if(meeting[i][1] > lastEndTime){
                list.add(meeting[i][0]+1);
                lastEndTime = meeting[i][2];
            }
        }
        Collections.sort(list);
        return list;
    }
}
