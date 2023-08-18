function and(a,b) {
    if (a === 1 && b === 1) {
        return 1
    } else {
        return 0
    }
}

function or(a,b) {
    if (a === 1)
        return 1
    if (b === 1)
        return 1
    else
        return 0
}

function xor(a,b) {
    if (and(a,b))
        return 0;
    return or(a,b);
}

function nor(a,b) {
    return not(or(a,b))
}

function add1(a,b) {
    overflow = and(a,b)
    sum = xor(a,b)
    return {sum, overflow}
}



// add1(0, 1)
// add2(00, 01)
// add4(0000, 1001)
// add8(10100000, 11001001)

