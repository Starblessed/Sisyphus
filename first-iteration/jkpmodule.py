import greeter as grt
import _sqlite3 as sqlite3
import random as rd

path = r'c:\users\dannylo\documents\sisyphus\jkpdb'
conn = sqlite3.connect(path + r'\teste.db')
cursor = conn.cursor()
print(conn)
# 1 = COM wins, 2 = Player wins, 3 = Draw

cursor.execute('CREATE TABLE IF NOT EXISTS registries('
               'round tinyint,'
               'comp tinyint,'
               'playp tinyint,'
               'result tinyint);')


def prtp():
    with conn:
        cursor.execute('SELECT * FROM registries')
        print(cursor.fetchall())


user = input('Please, enter the user:')
gender = ''
while gender not in ['M', 'F']:
    gender = input('Are you a male or a female? (M/F)').upper()
    if gender not in ['M', 'F']:
        print('Please {}, insert a valid value.'.format(user))
greeter = grt.Greeting(user)
greeter.greet()
ref = 'sir' if gender == 'M' else 'ma\'am'
# 1 = Rock, 2 = Paper, 3 = Scissors
com = rd.randint(1, 3)
const = com - 1
player = 0
values = ['Rock', 'Paper', 'Scissors']
print('Protocol "Jokenpo" Initiated.\n'
      'Let\'s play rock/paper/scissors! \n'
      'I have already made my choice, now it\'s your turn to choose! I promise I won\'t cheat!')
roundcounter = 1
while player not in [1, 2, 3]:
    prtp()
    print('Round {}'.format(roundcounter))
    player = int(input('1 = Rock, 2 = Paper, 3 = Scissors\n'))
    if com == player:
        cursor.execute('INSERT INTO registries VALUES(?, ?, ?, ?)', (roundcounter, com, player, 3))
        print('Well, looks like a draw. I also chose {}!'.format(values[const]))
    elif (com == 1 and player == 2) or (com == 2 and player == 3) or (com == 3 and player == 1):
        cursor.execute('INSERT INTO registries VALUES(?, ?, ?, ?)', (roundcounter, com, player, 2))
        print('Oh no, I lost! Congratulations! I chose {}!'.format(values[const]))
    elif player not in [1, 2, 3]:
        print('No, {}. You can only choose 1, 2 or 3.'.format(ref))
    else:
        cursor.execute('INSERT INTO registries VALUES(?, ?, ?, ?)', (roundcounter, com, player, 1))
        print('Well played, but I won! I chose {}.'.format(values[const]))
    replay = ''
    while replay not in ['Y', 'N']:
        replay = input('{}, do you want to play again? (Y/N)'.format(user)).upper()
        if replay == 'Y':
            player = 0
            roundcounter += 1
        elif replay not in ['Y', 'N']:
            print('Invalid Command, {}. Please enter Y or N.'.format(ref))
