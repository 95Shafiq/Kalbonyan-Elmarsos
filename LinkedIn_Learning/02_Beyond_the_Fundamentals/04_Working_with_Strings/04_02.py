first_name = 'malala'
last_name = 'yousafzai'
note = 'name of the award: Nobel Peace Prize'

first_name_cap = first_name.capitalize()
last_name_cap = last_name.capitalize()

print(first_name_cap)
print(last_name_cap)

award_location = note.find('award: ')
award_text = note[award_location + 7:]
print(award_text)