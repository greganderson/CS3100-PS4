while (<STDIN>) {
	$text .= $_;
}

while ($text =~ m/\s\(\d\d\d\)\s?\d\d\d-\d\d\d\d\b/g) {
	$count++;
}
print $count;
