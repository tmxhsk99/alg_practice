package programmers.level2;

public class CrossStar_87337 {
    /**
     * 직선 A, B, C에 대한 정보가 담긴 배열 line이 매개변수로 주어집니다. 이때 모든 별을 포함하는 최소 사각형을 return 하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * line의 세로(행) 길이는 2 이상 1,000 이하인 자연수입니다.
     * line의 가로(열) 길이는 3입니다.
     * line의 각 원소는 [A, B, C] 형태입니다.
     * A, B, C는 -100,000 이상 100,000 이하인 정수입니다.
     * 무수히 많은 교점이 생기는 직선 쌍은 주어지지 않습니다.
     * A = 0이면서 B = 0인 경우는 주어지지 않습니다.
     * 정답은 1,000 * 1,000 크기 이내에서 표현됩니다.
     * 별이 한 개 이상 그려지는 입력만 주어집니다.
     * 입출력 예
     * line	result
     * [[2, -1, 4], [-2, -1, 4], [0, -1, 1], [5, -8, -12], [5, 8, 12]]	["....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"]
     * [[0, 1, -1], [1, 0, -1], [1, 0, 1]]	["*.*"]
     * [[1, -1, 0], [2, -1, 0]]	["*"]
     * [[1, -1, 0], [2, -1, 0], [4, -1, 0]]	["*"]
     *
     * */
    public static void main(String[] args) {
        int[][] ans1 = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        int[][] ans2 = {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};

    }

    public String[] solution(int[][] line) {
        /**
         * ㄷ문제 풀이 흐름
         * 1. 모든 직선 쌍에 대해 반복
         *  A. 교점 좌표 구하기
         *  B. 정수 좌표 구하기
         * 2. 저장된 정수들에 대해 x,y 좌표의 최댓값, 최솟값 구하기 
         * 3. 구한 최댓값, 최솟값을 이용하여 2차원 배열 크기 결정
         * 4. 2차원 배열에 별 표시 
         * 5. 문자열 배열로 변환 후 반환
        */



        String[] answer = {};
        return answer;
    }

    /**
     * 좌표를 표현하기 위한 좌표 클래스
     */
    private static class Point {
        /**
         * 문제조건중 1000*1000 크기 이내에서 표현된다는 조건은 별들 사이의 거리가 멀지 않다는 조건일뿐
         * 실제 좌표값이 작다는 의미가 아니므로 long으로 좌표를 다뤄야 오버플로가 발생하지 않는다.
         *
         */
        public final long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

}
