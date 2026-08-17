class Solution {
    public int kthDigit(long k) {

        if (k <= 9)
            return (int) k;

        k -= 9;

        long digits = 2;
        long firstBlock = 1;

        while (true) {

            long numberOfBlocks = 9 * pow10(digits - 2);

            long groupDigits =
                    numberOfBlocks * 10 * digits;

            if (k > groupDigits) {
                k -= groupDigits;
                firstBlock += numberOfBlocks;
                digits++;
            } else {
                break;
            }
        }

        long blockOffset =
                (k - 1) / (10 * digits);

        long b = firstBlock + blockOffset;

        long pos =
                (k - 1) % (10 * digits);

        long numberIndex = pos / digits;

        int digitIndex =
                (int)(pos % digits);

        long start = b * 10;

        long number;

        if (b % 2 == 0) {
            number = start + numberIndex;
        } else {
            number = start + 9 - numberIndex;
        }

        String s = String.valueOf(number);

        return s.charAt(digitIndex) - '0';
    }

    private long pow10(long n) {
        long result = 1;

        while (n-- > 0)
            result *= 10;

        return result;
    }
}