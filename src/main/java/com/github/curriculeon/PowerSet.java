package com.github.curriculeon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author leon on 10/01/2019.
 */
public class PowerSet<TypeOfSet> {

    private final TypeOfSet[] originalInput;

    public PowerSet(TypeOfSet[] originalInput) {
        this.originalInput = originalInput;
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        Set<Set<TypeOfSet>> outerSet = new HashSet<>();
        Set<TypeOfSet> innerSet = getOriginalSet();

        outerSet.add(innerSet); // One combo



        return outerSet;
    }

    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        return new LinkedHashSet<>(Arrays.asList(originalInput));
    }
}
