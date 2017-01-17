/**
 * Created by jcampbell on 1/16/17.
 */

/* open a JSON file

 */

import groovy.json.JsonSlurper

def inputFile = new File("../text2.json")
def InputJSON = new JsonSlurper().parseText(inputFile.text)

assert InputJSON instanceof List
assert InputJSON instanceof Map
//InputJSON.each{ println it }