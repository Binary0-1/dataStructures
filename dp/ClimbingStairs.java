	package dp;

	public class ClimbingStairs {

		static final long MOD = 1_000_000_007;

		static long recurr(int nStairs) {
			long prev1 = 1;
			long prev2 = 1;
			long curr  = -1;

			for(int i = 2; i <= nStairs;i++){
				curr = (prev1 + prev2) % MOD;
				prev2 = prev1;
				prev1 = curr;
			}
			return curr;
		}

		static long countDistinctWayToClimbStair(int nStairs) {
			return recurr(nStairs);
		}

		public static void main(String[] args) {
			System.out.println(countDistinctWayToClimbStair(5));
		}
	}