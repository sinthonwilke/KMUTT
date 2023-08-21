import os

try:
    if os.path.isdir('aa'):
        for root, dirs, files in os.walk('aa'):
            if files:
                for filename in files:
                        with open(f'{os.path.abspath(root)}\{filename}', 'r') as txt:
                            with open(r'aa\super_dd.txt', 'a') as super_dd:
                                super_dd.write(txt.read())
    else: raise FileNotFoundError

except FileNotFoundError:
    print(FileNotFoundError)

except Exception as e:
    print('Something went wrong.')
    print(e.__class__)

    
