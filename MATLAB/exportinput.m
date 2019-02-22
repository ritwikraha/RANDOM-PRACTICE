%%

basefilename='testfile';
numfiles=10;

%% creating the files

for filei= 1:numfiles
    
    filename=[ basefilename num2str(filei) '.mat' ];
    if exist(filename,'file') continue, end
    randomdata= randn(100);
    save(filename,'randomdata')
end
%% IMPORT FILES-
%% use wildcard (*) to find the files to import
files2import= dir('testfile*.mat');

% innitialize a cell array 
alldataC= cell(1,length(files2import));


%loop over file names

for filei=1:length(files2import)
    load(files2import(filei).name)
    alldataC(filei)= randomdata;
    if filei==1
        alldataM= zeroes(length(files2import),size(randomdata,1),size(randomdata,2));
    end
    alldataM(filei,:,:)=randomdata;
end
