class Solution {
    public List<List<Integer>> threeSum(int[] a) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(a);

        for (int i = 0; i < a.length - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = a.length - 1;

            while (j < k) {

                int sum = a[i] + a[j] + a[k];

                if (sum == 0) {

                    ans.add(Arrays.asList(a[i], a[j], a[k]));

                    j++;
                    k--;

                    // skip duplicates
                    while (j < k && a[j] == a[j - 1]) {
                        j++;
                    }

                    while (j < k && a[k] == a[k + 1]) {
                        k--;
                    }

                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return ans;
    }
}