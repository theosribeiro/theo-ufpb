/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificadorAritmetico;

/**
 *
 * @author Theo Ribeiro
 */
class ArithCoder {

    /** The low bound on the current interval for coding.  Initialized
     * to zero.
     */
    protected long _low; // implied = 0;

    /** The high bound on the current interval for coding.
     * Initialized to top value possible.
     */
    protected long _high = TOP_VALUE;

    /** Construct a generic arithmetic coder.
     */
    protected ArithCoder() { }

    /** Precision of coding, expressed in number of bits used for
     * arithmetic before shifting out partial results.
     */
    static final protected int CODE_VALUE_BITS = 27;
    
    /** The largest possible interval value. All <code>1</code>s.
     */
    static final protected long TOP_VALUE = ((long) 1 << CODE_VALUE_BITS) - 1;

    /** 1/4 of the largest possible value plus one.
     */
    static final protected long FIRST_QUARTER = TOP_VALUE / 4 + 1; 

    /** 1/2 of the largest possible value; <code>2 * FIRST_QUARTER</code>
     */
    static final protected long HALF = 2 * FIRST_QUARTER;
    
    /** 3/4 of the largest possible value; <code>3 * FIRST_QUARTER</code>
     */
    static final protected long THIRD_QUARTER = 3 * FIRST_QUARTER;
    
}
