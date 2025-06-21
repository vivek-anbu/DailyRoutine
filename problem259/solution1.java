package inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
  
class DigitState {
    int value;
    boolean isResultOfOperation;

    DigitState(int value, boolean isResultOfOperation) {
        this.value = value;
        this.isResultOfOperation = isResultOfOperation;
    }

    public String toString() {
        return isResultOfOperation ? "(" + value + ")" : String.valueOf(value);
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitState that = (DigitState) o;
        return that.value == value && isResultOfOperation == that.isResultOfOperation;
    }

    public int hashCode() {
        return Objects.hash(value, isResultOfOperation);
    }
}

class MonoDigit1 {
    public String monoDigitCon(int num) {
        String s = String.valueOf(num);
        if (s.isEmpty()) {
            return "Cannot create monoDigit";
        }

        List<DigitState> initialVal = new ArrayList<>();
        for (char c : s.toCharArray()) {
            initialVal.add(new DigitState(Character.getNumericValue(c), false));
        }

        if (isMonoDigit(initialVal)) {
            return s;
        }

        List<List<DigitState>> finalPath = new ArrayList<>();
        if (monoRecursiveConverter(initialVal, finalPath)) {
            List<DigitState> finalState = finalPath.get(finalPath.size() - 1);
            StringBuilder sb = new StringBuilder();
            for (DigitState ds : finalState) {
                sb.append(ds.value);
            }
            return sb.toString();
        } else {
            return "Cannot create monoDigit";
        }
    }

    private boolean monoRecursiveConverter(List<DigitState> curValue, List<List<DigitState>> finalPath) {
        if (isMonoDigit(curValue)) {
            finalPath.add(curValue);
            return true;
        }

        for (int i = 0; i < curValue.size() - 1; i++) {
            DigitState digit1 = curValue.get(i);
            DigitState digit2 = curValue.get(i + 1);
            if (digit1.isResultOfOperation || digit2.isResultOfOperation) {
                continue;
            }

            int[] possibleValues = {
                digit1.value + digit2.value,
                digit1.value - digit2.value,
                digit2.value - digit1.value
            };

            for (int resultOfOperation : possibleValues) {
                if (resultOfOperation >= 0 && resultOfOperation <= 9) {
                    List<DigitState> nextDigits = new ArrayList<>();
                    for (int k = 0; k < i; k++) {
                        nextDigits.add(curValue.get(k));
                    }
                    nextDigits.add(new DigitState(resultOfOperation, true));
                    for (int j = i + 2; j < curValue.size(); j++) {
                        nextDigits.add(curValue.get(j));
                    }

                    if (monoRecursiveConverter(nextDigits, finalPath)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean isMonoDigit(List<DigitState> curVal) {
        if (curVal.isEmpty()) {
            return false;
        }
        int firstVal = curVal.get(0).value;
        for (DigitState ds : curVal) {
            if (ds.value != firstVal) {
                return false;
            }
        }
        return true;
    }
}
public class problem2 {

    public static void main(String[] args) {
     
    	
    	MonoDigit1 m=new MonoDigit1();
    	int number=72581;
    	
    	System.out.println("Monodigit :"+m.monoDigitCon(number));
    	
    }
}
