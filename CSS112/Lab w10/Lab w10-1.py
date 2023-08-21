import os
try:
    folder_aa = 'aa'
    folder_bb = 'bb'
    folder_cc = 'cc'
    txt_dd = 'dd'

    for bb_num in range(1, 3+1):
        folder_bbNum = folder_bb + str(bb_num) #name folder
        folder_bbPath = os.path.join(folder_aa, folder_bbNum)                 
        os.makedirs(folder_bbPath)
        for cc_num in range(1, 3+1):
            folder_ccNum = folder_cc + str(cc_num) #name folder
            folder_ccPath = os.path.join(folder_bbPath, folder_ccNum)
            os.mkdir(folder_ccPath)
            for dd_num in range(1, 3+1):
                txt_ddNum = txt_dd + str(dd_num) #name file
                with open(f'{folder_ccPath}\{txt_ddNum}', 'w') as txt:
                    txt.write('''  Everything is half here,
like the marble head
of the Roman emperor
and the lean torso
of his favorite.
The way the funnel cloud
which doesn't seem
to touch ground does—
flips a few cars, a semi—
we learn to...
''')

except FileExistsError as e:
    print('FileAlreadyExist')
    print(e.__class__)

except Exception as e:
    print('Something went wrong.')
    print(e.__class__)
