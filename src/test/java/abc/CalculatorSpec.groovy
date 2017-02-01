package abc;

import static org.junit.Assert.*

import spock.lang.Specification
import spock.lang.Unroll


class CalculatorSpec extends Specification {

	@Unroll
	def addoperatorTest() {
		given:
		def calc = new Calculator()

		when:
		def result = calc.add(a, b)

		then:
		result == expected

		where:
		a  | b  | expected
		1  | 1  | 2
		0  | 0  | 0
		1  | 0  | 1
		0  | 1  | 1
	}
	@Unroll("#a ‚©‚ç #b ‚ðˆø‚¢‚½‚ç #exp")
	def "ˆø‚«ŽZ‚ÌƒeƒXƒg"() {
		given:
		def calc = new Calculator()
		
		when:
		def result =calc.extract(a,b)
		then: 
		result == exp
		where:
		a|b|exp
		1|1|0
		2|1|1
		1|5|-4
		1|1|0
		1|1|0
		
	}
	@Unroll("#a should have length #b")
	def "name length"() {
	  given:
	  def calc = new Calculator()
	//  when:
	 // def result = calc.extract(a,b)
	  
	  expect:
	  a-b == calc.extract(a,b)
   
	  where:
	  a << [1,2,3]
	  b << [4, 5, 6]
	}
	
	def testCombine(){
		setup:
			def bean = Mock(Library)
		when:
			def result = bean.someMethod1()
			println result
		then:
			1 * bean.someMethod1() >> 33
			result == 33
	}
	
}