""" This will parse the data from the unix command echo "Header1 is this~Header2 and that~~Data 1.0~Data 2.0" | tr "~" "\n"
which is:
Header1 is this
Header2 and that

Data 1.0
Data 2.0
"""

# Tokens
tokens = ('Tap','Cling','Clink','Drip', 'Whack', 'Shoes', 'Keys', 'Cuffs', 'Water', 'A', 'One')
literals = ['.',  ]

t_Tap = r'^Tap.*$'
t_Cling = r'^Cling.*$'
t_Clink = r'^Clink.*$'
t_Drip = r'^Drip.*$'
t_Whack = r'^Whack.*$'
t_Shoes = r'^Shoes.*$'
t_Keys = r'^Keys.*$'
t_Cuffs = r'^Cuffs.*$'
t_Water = r'^Water.*$'
t_A = r'^A.*$'
t_One= r'^One.*$'

# Ignored characters
t_ignore = " \r"

def t_newline(t):
    r'\n+'
    t.lexer.lineno += t.value.count("\n")

def t_error(t):
    print("Illegal character '%s'" % t.value[0])
    t.lexer.skip(1)

# Build the lexer
import ply.lex as lex   # ply.lex comes from the ply folder in the PLY download.
lexer = lex.lex()

# Parsing rules
global step
step = 0

def p_line1(t):
    '''line : Tap
             | Cling
             | Clink
             | Drip
             | Whack
    '''
    global step
    step += 1
    stringstep = str(step)
    print("")
    print("This is couplet: " + stringstep)
    print ("This is line 1 of the stanza, it has repetition: " + t[1])

def p_line2(t):
    '''line : Shoes
             | Keys
             | Cuffs
             | Water
             | A
    '''
    print("This is line 2 of the stanza: " + t[1])

def p_lastline(t):
    '''line : One

    '''
    print("")
    print("This is the last line of the poem: " + t[1])

def p_error(t):
    if t == None:
        print("Syntax error is t == None '%s'" % t)
    else:
        print("Syntax error is t == Other '%s'" % t.value)

import ply.yacc as yacc   # ply.yacc comes from the ply folder in the PLY download.
parser = yacc.yacc()

while True:
    try:
        s = raw_input('')
    except EOFError:
        break
    parser.parse(s)

# To run the parser do the following in a terminal window: echo "Header1 is this~Header2 and that~~Data 1.0~Data 2.0" | tr "~" "\n" | grep -v '^\s*$' | python PLYstarter.py | sed "s/_~_/ which is a float./"
